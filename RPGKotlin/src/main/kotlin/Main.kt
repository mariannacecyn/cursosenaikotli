import java.util.*

fun main(args: Array<String>) {
    var persona = Personagem()
    var oponente = Personagem()
    var terminal = Scanner (System.`in`)
    println("Informe o seu personagem:")
    persona.nome = terminal.nextLine();
    println("Informe o seu oponente:")
    oponente.nome = terminal.nextLine();

    if (persona.nome == "Mago") {
        var persona1 = Personagem()
        persona1.nome  = "Mago"
        persona1.vida  = 120
        persona1.superpoder = "magia"
        persona1.forca = 40
        persona = persona1
    }
    if (persona.nome == "Cavaleiro") {
        var persona2 = Personagem()
        persona2.nome = "Cavaleiro"
        persona2.vida = 80
        persona2.superpoder = "forca"
        persona2.forca = 80
        persona = persona2
    }
    if (persona.nome == "Elfo") {
        var persona3 = Personagem()
        persona3.nome = "Elfo"
        persona3.vida = 100
        persona3.superpoder = "velocidade"
        persona3.forca = 60
        persona = persona3
    }
    if (persona.nome == "Anao") {
        var persona4 = Personagem()
        persona4.nome = "Anao"
        persona4.vida = 150
        persona4.superpoder = "velocidade"
        persona4.forca = 10
        persona = persona4
    }

    if (oponente.nome == "Mago") {
        var persona1 = Personagem()
        persona1.nome = "Mago"
        persona1.vida = 120
        persona1.superpoder = "magia"
        persona1.forca = 40
        oponente = persona1
    }
    if (oponente.nome == "Cavaleiro") {
        var persona2 = Personagem()
        persona2.nome = "Cavaleiro"
        persona2.vida = 80
        persona2.superpoder = "forca"
        persona2.forca = 80
        oponente = persona2
    }
    if (oponente.nome == "Elfo") {
        var persona3 = Personagem()
        persona3.nome = "Elfo"
        persona3.vida = 100
        persona3.superpoder = "velocidade"
        persona3.forca = 60
        oponente = persona3
    }
    if (oponente.nome == "Anao") {
        var persona4 = Personagem()
        persona4.nome = "Anao"
        persona4.vida = 150
        persona4.superpoder = "velocidade"
        persona4.forca = 10
        oponente = persona4
    }

    var dadopersonagem: Int
    dadopersonagem = Random().nextInt(1,20);
    var dadooponente: Int
    dadooponente = Random().nextInt(1,20);

    if (dadopersonagem==20) {
        persona.forca = 2 * persona.forca
    }
    if (dadooponente==20) {
        oponente.forca = 2 * oponente.forca
    }

    if (persona.forca > oponente.vida) {
        println("Você Venceu")
    }
    else {
        println("Não foi dessa vez")
    }

    if (persona.vida < oponente.forca) {
        println("Você Morreu")
    }
    else {
        println("Você está ferido mas vai sobreviver")
    }
}