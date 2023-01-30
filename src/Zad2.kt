fun main()
{
    try {
        print("Введите число от 1 до 9: ");

        var a = readLine()!!.toInt();
        if(a => 10 || a <= 0) throw java.lang.Exception("Число должно быть от 1 до 9")
        val result = when(a)
        {
            1->"Один"
            2->"два"
            3->"три"
            4->"четыре"
            5->"пять"
            6->"шесть"
            7->"семь"
            8->"восемь"
            9->"девять"
            else -> "Число не подходит"
        }
        print(result)
    }
    catch (ex: Exception)
    {
        println(ex.message)
    }
}