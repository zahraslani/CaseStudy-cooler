package translate.mqttToCoap

fun temperatureToCooler(temperature: String): String {
    // define how target is computed from source
    return ((temperature.toDoubleOrNull() ?: 0.0) > 20.0).toString()
} 
