package com.example.praktikumwireframe

data class FoodItem(
    val id: Int,
    val name: String,
    val description: String,
    val price: String,
    val colorRes: Int
)

object FoodData {
    val foodList = listOf(
        FoodItem(
            1,
            "Es Teh Manis Jumbo",
            "Teh manis dingin dengan es batu yang menyegarkan, porsi jumbo",
            "Rp 5.000",
            R.color.brownDrink
        ),
        FoodItem(
            2,
            "Jus Alpukat Segar",
            "Jus alpukat murni tanpa campuran, creamy dan menyegarkan",
            "Rp 12.000",
            R.color.greenDrink
        ),
        FoodItem(
            3,
            "Cappuccino Premium",
            "Kopi cappuccino dengan foam susu yang lembut dan aroma khas",
            "Rp 18.000",
            R.color.brownDrink
        ),
        FoodItem(
            4,
            "Thai Tea Original",
            "Thai tea asli Thailand dengan susu creamer yang manis",
            "Rp 15.000",
            R.color.primaryOrange
        ),
        FoodItem(
            5,
            "Lemon Tea Fresh",
            "Teh lemon segar dengan perasan lemon asli dan madu",
            "Rp 10.000",
            R.color.accentYellow
        ),
        FoodItem(
            6,
            "Milkshake Cokelat",
            "Milkshake cokelat dengan topping whipped cream dan choco chips",
            "Rp 20.000",
            R.color.brownDrink
        ),
        FoodItem(
            7,
            "Smoothie Strawberry",
            "Smoothie strawberry segar dengan yogurt dan madu alami",
            "Rp 22.000",
            R.color.pinkDrink
        ),
        FoodItem(
            8,
            "Es Jeruk Peras",
            "Jeruk peras asli tanpa pengawet dengan es batu serut",
            "Rp 8.000",
            R.color.primaryOrange
        ),
        FoodItem(
            9,
            "Kopi Susu Gula Aren",
            "Kopi robusta dengan susu fresh dan gula aren murni",
            "Rp 16.000",
            R.color.brownDrink
        ),
        FoodItem(
            10,
            "Matcha Latte Premium",
            "Matcha latte dengan bubuk matcha Jepang original dan susu oat",
            "Rp 25.000",
            R.color.greenDrink
        ),
        FoodItem(
            11,
            "Bubble Tea Brown Sugar",
            "Bubble tea dengan brown sugar pearl dan fresh milk",
            "Rp 18.000",
            R.color.brownDrink
        ),
        FoodItem(
            12,
            "Blue Ocean Soda",
            "Soda biru menyegarkan dengan lychee jelly dan es crush",
            "Rp 14.000",
            R.color.blueDrink
        )
    )
}
