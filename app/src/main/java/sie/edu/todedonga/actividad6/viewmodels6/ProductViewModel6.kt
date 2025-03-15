package sie.edu.todedonga.actividad6.viewmodels6

import androidx.lifecycle.ViewModel
import sie.edu.todedonga.R
import sie.edu.todedonga.actividad6.models6.ProductModel6

class ProductViewModel6() : ViewModel() {

    fun ProductosNitendo(): List<ProductModel6> {
        var zelda =
            ProductModel6(
                id = 1, name = "The Legend of Zelda: Breath of the Wild",
                shipping = "Free Shipping",
                label = "",
                price = 1199.0f,
                image = R.drawable.zeldabotw
            )

        var splatoon3 =
            ProductModel6(
                id = 2, name = "Splatoon 3",
                shipping = "Free Shipping",
                label = "",
                price = 1199.0f,
                image = R.drawable.splatoon3
            )

        var marioodyssey =
            ProductModel6(
                id = 3, name = "Super Mario Odyssey",
                shipping = "Free Shipping",
                label = "",
                price = 899.0f,
                image = R.drawable.marioodyssey
            )

        var smash =
            ProductModel6(
                id = 4, name = "Super Smash Bros Ultimate",
                shipping = "Free Shipping",
                label = "",
                price = 1099.0f,
                image = R.drawable.smash
            )

        var mariokart =
            ProductModel6(
                id = 5, name = "Mario Kart 8 Deluxe",
                shipping = "Free Shipping",
                label = "",
                price = 899.0f,
                image = R.drawable.mariokart
            )

        var productsListNintendo = listOf<ProductModel6>(
            zelda,
            splatoon3,
            marioodyssey,
            smash,
            mariokart,
        )
        return productsListNintendo
    }

    fun ProductosPlayStation(): List<ProductModel6> {
        var godofwar =
            ProductModel6(
                id = 1, name = "God of War Ragnarök",
                shipping = "Free Shipping",
                label = "",
                price = 1199.0f,
                image = R.drawable.godofwar
            )

        var finalfantasy =
            ProductModel6(
                id = 2, name = "Final Fantasy VII Rebirth",
                shipping = "Free Shipping",
                label = "",
                price = 1399.0f,
                image = R.drawable.finalfantasy
            )

        var eldenring =
            ProductModel6(
                id = 3, name = "Elden Ring",
                shipping = "Free Shipping",
                label = "",
                price = 1299.0f,
                image = R.drawable.eldenring
            )

        var helldivers2 =
            ProductModel6(
                id = 4, name = "Helldivers 2",
                shipping = "Free Shipping",
                label = "",
                price = 999.0f,
                image = R.drawable.helldivers2
            )

        var silenthill2 =
            ProductModel6(
                id = 5, name = "Silent Hill 2 Remake",
                shipping = "Free Shipping",
                label = "",
                price = 1299.0f,
                image = R.drawable.silenthill2
            )

        var productsListPlayStation = listOf<ProductModel6>(
            godofwar,
            finalfantasy,
            eldenring,
            helldivers2,
            silenthill2,
        )
        return productsListPlayStation
    }

    fun ProductosXbox(): List<ProductModel6> {
        var dbsz =
            ProductModel6(
                id = 1, name = "Dragon Ball Sparking Zero",
                shipping = "Free Shipping",
                label = "",
                price = 1399.0f,
                image = R.drawable.dbsz
            )

        var gta5 =
            ProductModel6(
                id = 2, name = "Grand Theft Auto V",
                shipping = "Free Shipping",
                label = "",
                price = 599.0f,
                image = R.drawable.gta5
            )

        var wwe =
            ProductModel6(
                id = 3, name = "WWE 2K25",
                shipping = "Free Shipping",
                label = "",
                price = 1499.0f,
                image = R.drawable.wwe
            )

        var residentevil =
            ProductModel6(
                id = 4, name = "Resident Evil 4 Remake",
                shipping = "Free Shipping",
                label = "",
                price = 599.0f,
                image = R.drawable.residentevil
            )

        var stray =
            ProductModel6(
                id = 5, name = "Skybound Stray",
                shipping = "Free Shipping",
                label = "",
                price = 599.0f,
                image = R.drawable.stray
            )

        var productsListXbox = listOf<ProductModel6>(
            dbsz,
            gta5,
            wwe,
            residentevil,
            stray,
        )
        return productsListXbox
    }

    fun ProductosAmiibos(): List<ProductModel6> {
        var squidsisters =
            ProductModel6(
                id = 1, name = "Nintendo Amiibo Alterna Set - Callie & Marie",
                shipping = "Free Shipping",
                label = "",
                price = 1299.0f,
                image = R.drawable.squidsisters
            )

        var corrin =
            ProductModel6(
                id = 2, name = "Nintendo Amiibo Corrin (Player 2)",
                shipping = "Free Shipping",
                label = "",
                price = 499.0f,
                image = R.drawable.corrin
            )

        var banjo =
            ProductModel6(
                id = 3, name = "Nintendo Amiibo Banjo & Kazooie",
                shipping = "Free Shipping",
                label = "",
                price = 599.0f,
                image = R.drawable.banjo
            )

        var cloud =
            ProductModel6(
                id = 4, name = "Nintendo Amiibo Cloud (Player 2)",
                shipping = "Free Shipping",
                label = "",
                price = 499.0f,
                image = R.drawable.cloud
            )

        var zelda =
            ProductModel6(
                id = 5, name = "Nintendo Amiibo Zelda Tears of the Kingdom",
                shipping = "Free Shipping",
                label = "",
                price = 499.0f,
                image = R.drawable.zelda
            )

        var productsListAmiibos = listOf<ProductModel6>(
            squidsisters,
            corrin,
            banjo,
            cloud,
            zelda,
        )
        return productsListAmiibos
    }

    fun ProductosFunkos(): List<ProductModel6> {
        var mitsuri =
            ProductModel6(
                id = 1, name = "Funko Pop!: Demon Slayer - Mitsuri Kanroji",
                shipping = "Free Shipping",
                label = "",
                price = 299.0f,
                image = R.drawable.mitsuri
            )

        var gengar =
            ProductModel6(
                id = 2, name = "Funko Pop!: Pokemon - Gengar",
                shipping = "Free Shipping",
                label = "",
                price = 399.0f,
                image = R.drawable.gengar
            )

        var vegito =
            ProductModel6(
                id = 3, name = "Funko Pop!: DBZ - Vegito",
                shipping = "Free Shipping",
                label = "",
                price = 399.0f,
                image = R.drawable.vegito
            )

        var majinvegeta =
            ProductModel6(
                id = 4, name = "Funko Pop!: DBZ - Majin Vegeta",
                shipping = "Free Shipping",
                label = "",
                price = 399.0f,
                image = R.drawable.majinvegeta
            )

        var mightguy =
            ProductModel6(
                id = 5, name = "Funko Pop!: Naruto - Might Guy, Eight Inner Gates",
                shipping = "Free Shipping",
                label = "",
                price = 199.0f,
                image = R.drawable.mightguy
            )

        var productsListFunkos = listOf<ProductModel6>(
            mitsuri,
            gengar,
            vegito,
            majinvegeta,
            mightguy,
        )
        return productsListFunkos
    }
}