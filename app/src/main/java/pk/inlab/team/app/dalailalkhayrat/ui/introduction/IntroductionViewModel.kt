package pk.inlab.team.app.dalailalkhayrat.ui.introduction

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class IntroductionViewModel : ViewModel() {

    private val _texts = MutableLiveData<List<String>>().apply {
        value = (1..16).mapIndexed { _, i ->
            "This is item # $i"
        }
    }

    val texts: LiveData<List<String>> = _texts
}