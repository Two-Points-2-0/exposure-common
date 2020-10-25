package com.twopointsexposure.common.serialization.model

enum class ServiceAccessState {
    REQUIRES_APP_UPGRADE, // this app version is blocked from accessing service
    REQUIRES_AUTHENTICATION, // need an account
    REQUIRES_SUBSCRIPTION,  // need to have an active subscription
    ACCESS_GRANTED // good to go
}

interface ServiceAccessStrategy {

    companion object {
        fun handle(statusResource: Resource<ServiceAccessState>, strategy: ServiceAccessStrategy) {
            when (statusResource.status) {
                Status.LOADING -> {
                    statusResource.data?.let { strategy.onLoading(it) }
                }
                Status.ERROR -> {
                    statusResource.data?.let { strategy.onErrored(it, statusResource.message) }
                }
                Status.SUCCESS -> {
                    statusResource.data?.let {
                        when (it) {
                            ServiceAccessState.REQUIRES_APP_UPGRADE ->
                                strategy.onRequireAppUpgrade()
                            ServiceAccessState.REQUIRES_AUTHENTICATION ->
                                strategy.onRequireAuthentication()
                            ServiceAccessState.REQUIRES_SUBSCRIPTION ->
                                strategy.onRequireSubscription()
                            ServiceAccessState.ACCESS_GRANTED ->
                                strategy.onAccessGranted()
                        }
                    }
                }
            }
        }
    }

    /**
     * @param state ServiceAccessState that is being loaded
     */
    fun onLoading(state: ServiceAccessState)

    fun onRequireAppUpgrade()

    fun onRequireAuthentication()

    fun onRequireSubscription()

    fun onAccessGranted()

    /**
     * @param state ServiceAccessState that was being loaded
     * @param message error message encountered while loading state
     */
    fun onErrored(state: ServiceAccessState, message: String?)
}