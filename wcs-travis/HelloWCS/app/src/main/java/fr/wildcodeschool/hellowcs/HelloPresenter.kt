package fr.wildcodeschool.hellowcs

class HelloPresenter(private val view: HelloView) {
    fun onValidate(name: String) {
        view.sayHello(name)
    }
}