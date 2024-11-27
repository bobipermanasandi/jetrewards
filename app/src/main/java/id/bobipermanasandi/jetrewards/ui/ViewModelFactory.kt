package id.bobipermanasandi.jetrewards.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.bobipermanasandi.jetrewards.data.RewardRepository
import id.bobipermanasandi.jetrewards.ui.screen.cart.CartViewModel
import id.bobipermanasandi.jetrewards.ui.screen.detail.DetailRewardViewModel
import id.bobipermanasandi.jetrewards.ui.screen.home.HomeViewModel
import kotlin.jvm.java

class ViewModelFactory(private val repository: RewardRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            return HomeViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(DetailRewardViewModel::class.java)) {
            return DetailRewardViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(CartViewModel::class.java)) {
            return CartViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}