package com.zakharov.product_details.data.utils

import com.zakharov.product_details.data.entities.ProductDetails

//Потом нормальную DTO написать надо бы, вместо этого индийского кода))
fun ProductDetails.getIngredients(): String {
    var ingredients = ""
    if (this.strIngredient1 != null && this.strIngredient1 != "")
    ingredients += this.strIngredient1 + " , "
    if (this.strIngredient2 != null && this.strIngredient2 != "")
        ingredients += this.strIngredient2 + " , "
    if (this.strIngredient3 != null && this.strIngredient3 != "")
        ingredients += this.strIngredient3 + " , "
    if (this.strIngredient4 != null && this.strIngredient4 != "")
        ingredients += this.strIngredient4 + " , "
    if (this.strIngredient5 != null && this.strIngredient5 != "")
        ingredients += this.strIngredient5 + " , "
    if (this.strIngredient6 != null && this.strIngredient6 != "")
        ingredients += this.strIngredient6 + " , "
    if (this.strIngredient7 != null && this.strIngredient7 != "")
        ingredients += this.strIngredient7 + " , "
    if (this.strIngredient8 != null && this.strIngredient8 != "")
        ingredients += this.strIngredient8 + " , "
    if (this.strIngredient9 != null && this.strIngredient9 != "")
        ingredients += this.strIngredient9 + " , "
    if (this.strIngredient10 != null && this.strIngredient10 != "")
        ingredients += this.strIngredient10 + " , "
    return ingredients
}