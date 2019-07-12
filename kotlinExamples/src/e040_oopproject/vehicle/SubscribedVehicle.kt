package e040_oopproject.vehicle

import e040_oopproject.util.Subscription

class SubscribedVehicle(private var subscription: Subscription, private val plate: String) : Vehicle {

    override fun getSubscription() = subscription
    override fun getPlate() = plate
    override fun isOfficial() = false
    override fun toString() = "$plate - Subscribed\n"
}