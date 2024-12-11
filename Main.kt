import java.util.Scanner

fun main() {
    //menggunakan Scanner agar interaktif
    val userInput = Scanner(System.`in`)
    //Program untuk Searching dan Sorting
    print("masukan banyak angka yang akan dimasukan: ")
    var ukuran = userInput.nextInt()
    print("masukan angka - angka (Array): ")
    var nums = Array(ukuran){0}
    for(i in nums.indices){
        nums[i] = userInput.nextInt()
    }
    bubleSort(nums)
    print("masukan angka yang ingin dicari: ")
    var key = userInput.nextInt()
    var output = search(key, nums)
    print("angka yang sudah diurutkan: ")
    for (x in nums.indices){
        print("${nums[x]} ")
    }
    println()
    if (output != -1){
        println("Angka $key ditemukan di indeks ke-$output")
    }
    else{
        println("Angka tidak ditemukan")
    }
}
fun search (key: Int, angka: Array<Int>): Int{
    for(x in angka.indices){
        if (key == angka[x]){
            return x
        }
    }
    return -1
}
//menggunakan BubbleSort
fun bubleSort(angka: Array<Int>){
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