package id.bobipermanasandi.jetrewards.ui.screen.cart

import id.bobipermanasandi.jetrewards.model.OrderReward

data class CartState(
    val orderReward: List<OrderReward>,
    val totalRequiredPoint: Int
)