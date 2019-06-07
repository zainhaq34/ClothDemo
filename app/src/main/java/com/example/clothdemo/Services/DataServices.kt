package com.example.clothdemo.Services

import com.example.clothdemo.Model.Category
import com.example.clothdemo.Model.Product

object DataServices {

    // Category List of Dummy Data
    val categories = listOf(
        Category("HATS", "hatimage"),
        Category("HOODIES", "hoodieimage"),
        Category("SHIRTS", "shirtimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("HATS", "hatimage"),
        Category("HOODIES", "hoodieimage"),
        Category("SHIRTS", "shirtimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("HATS", "hatimage"),
        Category("HOODIES", "hoodieimage"),
        Category("SHIRTS", "shirtimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("HATS", "hatimage"),
        Category("HOODIES", "hoodieimage"),
        Category("SHIRTS", "shirtimage"),
        Category("DIGITAL", "digitalgoodsimage"),Category("HATS", "hatimage"),
        Category("HOODIES", "hoodieimage"),
        Category("SHIRTS", "shirtimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    // Product List of Dummy Data
    val hats = listOf(
        Product("Graphic Beanie", "$18", "hat1"),
        Product("Hat Black", "$20", "hat2"),
        Product("Hat White", "$15", "hat3"),
        Product("Hat Snapback", "$12", "hat4")
    )
    val hoodies = listOf(
        Product("Hoodie Gray", "$18", "hoodie1"),
        Product("Hoodie Red", "$20", "hoodie2"),
        Product("Hoodie XYZ", "$14", "hoodie3"),
        Product("Hoodie Black", "$15", "hoodie4")
    )
    val shirts = listOf(
        Product("Shirt Gray", "$28", "shirt1"),
        Product("Shirt Black", "$25", "shirt2"),
        Product("Shirt Grey", "$30", "shirt3"),
        Product("Shirt Red", "$20", "shirt4"),
        Product("Shirt White", "$30", "shirt5")
    )
}