// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String, val matricula: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    infix fun matricular(usuario: Usuario) {
        
        inscritos.add(usuario)
        
        println("Usuário ${usuario.nome} matriculado com sucesso!")
    }
}

fun main() {
    
    var usuario = Usuario("Carla", 1)
    val nivel = Nivel.INTERMEDIARIO
    
    val conteudo1 = ConteudoEducacional("Kotlin para Programadores Java", 13)
    val conteudo2 = ConteudoEducacional("Padrões de projeto com Kotlin", 6)
    val conteudo3 = ConteudoEducacional("Java e Spring Boot", 14)
    val conteudo4 = ConteudoEducacional("Kotlin e Spring Boot", 9)
    
    val conteudos: List<ConteudoEducacional> = mutableListOf(conteudo1,
                                                             conteudo2,
                                                             conteudo3,
                                                             conteudo4)
    
    var formacao = Formacao("Code Update TQI - Backend com Kotlin e Java", nivel, conteudos)
    formacao.matricular(usuario)
}
