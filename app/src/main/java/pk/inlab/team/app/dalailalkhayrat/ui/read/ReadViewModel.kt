package pk.inlab.team.app.dalailalkhayrat.ui.read

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReadViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is reflow Fragment"
    }
    val text: LiveData<String> = _text
}