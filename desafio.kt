// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { INICIANTE, INTERMEDIARIO, AVANÇADO }

 
data class Usuario (

    val name: String, 
    val email: String, 
    val age: Int, 
    var Telefone: String // variavel do tipo String para poder armazenar os codigos telefonico de cada paiz ou estado
    
)

 
data class ConteudoEducacional(
    
    val nome: String, 
    val duracao: Int = 120
    
)

  
data class Formacao(
    
    val nome: String, 
    val nivel: Nivel, 
    val conteudos: List<ConteudoEducacional>
    
) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuario: Usuario) {
        
		// inscrição de 1 ou mais usuarios ao mesmo tempo
        for (dadosDoUsuario in usuario){
            inscritos.add(dadosDoUsuario)
            println("usuario ${dadosDoUsuario.name} incrito")
        }
    }
}

fun main() {
    
    //armazenamento temporario da lista de conteudos educacional 
    val conteudosEducacional = listOf<ConteudoEducacional>(
    	ConteudoEducacional("SQL", 180),
        ConteudoEducacional("NoSQL", 180),
        ConteudoEducacional("funções em Kotlin")
    )
    
    //definição do curso para inscrição 
    val formacao = Formacao(
    	"Desenvolvimento Backend", Nivel.INTERMEDIARIO, conteudosEducacional
    )
    
    //armazenamento temporario da lista de Usuarios
    val usuario = listOf<Usuario>(
    	Usuario("Danilo", "danilsonGeril90@gmail", 14, "+244 951027824"),
        Usuario("Elfio", "gabiel145Tutty@gmail", 20, "+244 945980096"),
        Usuario("Elidiu", "chamielCigueira@gmail", 32, "+244 967234099")
    )
    
	
    formacao.matricular(usuario[0], usuario[1])
    formacao.matricular(usuario[2])

}
