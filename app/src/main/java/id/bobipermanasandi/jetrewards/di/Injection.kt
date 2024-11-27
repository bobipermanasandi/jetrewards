package id.bobipermanasandi.jetrewards.di

import id.bobipermanasandi.jetrewards.data.RewardRepository

object Injection {
    fun provideRepository(): RewardRepository {
        return RewardRepository.getInstance()
    }
}