package fr.wildcodeschool.hellowcs

import com.nhaarman.mockito_kotlin.eq
import com.nhaarman.mockito_kotlin.verify
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class HelloPresenterTest {
    @Mock
    lateinit var view: HelloView

    lateinit var presenter: HelloPresenter

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        presenter = HelloPresenter(view)
    }

    @Test
    fun onValidate() {
        val name = "Test"
        presenter.onValidate(name)
        verify(view).sayHello(eq(name))
    }
}
