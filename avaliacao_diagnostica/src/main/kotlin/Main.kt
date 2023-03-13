fun main(args: Array<String>) {
    val empregado1 = Empregado("Homer", "Simpson",1000.0f)
    val empregado2 = Empregado("John", "Doe", 10000.0f)
    val empregado3 = Empregado("Jane", "Doe", -1000.0f)

    val salario1 = empregado1.getSalario();
    empregado1.setSalario(salario1*1.10f);
    val salario2 = empregado2.getSalario();
    empregado2.setSalario(salario2*1.10f);
    val salario3 = empregado3.getSalario();
    empregado3.setSalario(salario3*1.10f);

    println(empregado1.getSalario())
    println(empregado2.getSalario())
    println(empregado3.getSalario())

    println(empregado1.recebeBem())
    println(empregado2.recebeBem())
    println(empregado3.recebeBem())


}