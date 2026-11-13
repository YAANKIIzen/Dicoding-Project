fun main() {
    val openhour = 9
    val now = 9

    if(openhour > 7 && now > 7){
        println("Kantor sudah buka")
    } else if( openhour >= 7 && now >= 7){   
        println("Tunggu Sebentar, Kantor akan segera buka")
    } else {
        println("Saat ini kantor tutup")
    }
 

}
