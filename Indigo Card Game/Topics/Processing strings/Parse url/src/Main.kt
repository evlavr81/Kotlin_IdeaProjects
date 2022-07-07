fun main() {
    //var url1: String = "https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost"
    //var url2: String = "https://target.com/index.html?port=8080&cookie=&host=localhost"

    var url3 = readln()

    val urlMap: MutableMap<String, String> = mutableMapOf()
    val parseIt1 = url3.split("?").drop(1)
    //println(parseIt1)
    val replaced = parseIt1[0].replace("=&","=not found&")
    //println(replaced)
    val parseIt2 = replaced.split("&")
    //println(parseIt2)
    for (item in parseIt2) {
        val curr = item.split("=")
        urlMap[curr[0]] = curr[1]
    }
    urlMap.forEach {
            k, v -> println("$k : $v")
    }
    if (urlMap.containsKey("pass")){
        println("password : ${urlMap.get("pass")}")
    }

}

