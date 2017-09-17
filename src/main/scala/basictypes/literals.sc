// Integer literals
val hex = 0x5
val hex2 = 0x00FF
val magic = 0xcafebabe

val dec1 = 31
val dec2 = 255
val dec3 = 20

val prog = 0XCAFEBABEL
val tower = 35L
val of = 31l

val little: Short = 367
val littler: Byte = 38

// Floating point literals
val big = 1.2345
val bigger = 1.2345e1
val biggerStill = 123E45

val littleF = 1.2345F
val littleBigger = 3e5f
val anotherDouble = 3e5
val yetAnother = 3e5D

// Character literals
val a = 'A'

val d = '\u0041'
val f = '\u0044'

val backslash = '\\'

// String literals
val hello = "hello"
val escapes = "\\\"\'"

// Raw strings
println(
  """|Welcome to Ultamix 3000.
     |Type "HELP" for help.
  """.stripMargin)

// Symbol literals
def updateRecordByName(r: Symbol, value: Any): Unit = {
  // code goes here
}

updateRecordByName('favoriteAlbum, "OK Computer")

val s = 'aSymbol
val nm = s.name

// Boolean literals
val bool = true
val fool = false
