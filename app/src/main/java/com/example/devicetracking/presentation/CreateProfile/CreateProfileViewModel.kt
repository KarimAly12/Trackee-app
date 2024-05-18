package com.example.flightdelivery.Presentation.CreateProfile

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.devicetracking.domain.Usecases.ParentUsecases.ParentUsecases

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class  CreateUserViewModel @Inject constructor(

    //val childUsecases: ChildUsecases,
    val parentUsecases: ParentUsecases,
    //val userAuthRepository: UserAuthRepository,
    savedStateHandle: SavedStateHandle
):ViewModel() {




    var firstName = mutableStateOf("")
    var lastName = mutableStateOf("")
    var userType = mutableStateOf("")
}