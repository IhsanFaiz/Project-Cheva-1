import java.util.Scanner
val userInput = Scanner(System.`in`)
fun main() {

    while (true) {
        when (pilih()) {
            1 -> {
                var nums = ArrayList<Int>()
                masukan(nums)
                print("masukan angka yang ingin dicari: ")
                var key = readLine()!!.toInt()
                var output = search(key, nums)
                if (output != -1) {
                    println("Angka $key ditemukan di indeks ke-$output")
                } else {
                    println("Angka tidak ditemukan")
                }
                println()
            }
            2 -> {
                var nums = ArrayList<Int>()
                masukan(nums)
                println("Urutkan dari terkecil atau terbesar")
                println("1. urutkan dari terkecil")
                println("2. urutkan dari terbesar")
                print("Pilih: ")
                var pilihan = readLine()!!.toInt()
                if (pilihan == 1) {
                    bubleSortKecilBesar(nums)
                    print("angka yang sudah diurutkan: ")
                    for (x in nums.indices) {
                        print("${nums[x]} ")
                    }
                } else if (pilihan == 2) {
                    bubleSortBesarKecil(nums)
                    print("angka yang sudah diurutkan: ")
                    for (x in nums.indices) {
                        print("${nums[x]} ")
                    }
                }
                else{
                    println("Pilihan Tidak ada")
                }
                println("\n")
            }
            3 -> {
                return
            }
            else -> {
                println("Pilihan tidak ada")
                break
            }
        }
    }
}
fun pilih(): Int{
    println("PILIH SALAH SATU")
    println("1. Mencari indeks angka")
    println("2. mengurutkan angka")
    println("3. Keluar")
    print("Pilih: ")
    return readLine()!!.toInt()
}
fun search (key: Int, angka: ArrayList<Int>): Int{
    for(x in angka.indices){
        if (key == angka[x]){
            return x
        }
    }
    return -1
}
fun bubleSortKecilBesar(angka: ArrayList<Int>){
    val n = angka.size
    for (i in 0 until n - 1){
        for (j in 0 until n - 1 - i) {
            if(angka[j] > angka[j + 1]){
                var temp = angka[j]
                angka[j] = angka[j + 1]
                angka[j + 1] = temp
            }
        }
    }
}
fun bubleSortBesarKecil(angka: ArrayList<Int>){
    val n = angka.size
    for (i in 0 until n - 1){
        for (j in 0 until n - 1 - i) {
            if(angka[j] < angka[j + 1]){
                var temp = angka[j]
                angka[j] = angka[j + 1]
                angka[j + 1] = temp
            }
        }
    }
}
fun masukan(nums: ArrayList<Int>){
    print("masukan angka - angka (Array) Akhiri dengan -1: ")
    var i = 0
    while (true) {
        var masukan = userInput.nextInt()
        if (masukan == -1){
            break
        }
        nums.add(masukan)
        i++
    }
}