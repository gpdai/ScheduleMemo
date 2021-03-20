package jp.co.abs.schedule

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val dateManager: DateManager = DateManager()
    val titleText = MutableLiveData(dateManager.title)

    fun prevButtonOnClick() {
        dateManager.prevMonth()
        titleText.value = dateManager.title
    }

    fun nextButtonOnClick() {
        dateManager.nextMonth()
        titleText.value = dateManager.title
    }
}