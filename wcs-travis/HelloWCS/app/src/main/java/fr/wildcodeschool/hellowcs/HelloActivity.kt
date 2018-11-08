package fr.wildcodeschool.hellowcs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hello.*

class HelloActivity : AppCompatActivity(), HelloView {

    private val presenter = HelloPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        validateButton.setOnClickListener {
            val name = nameEditText.text.toString()
            presenter.onValidate(name)
        }
    }

    override fun sayHello(name: String) {
        helloTextView.text = getString(R.string.hello, name)
    }
}
