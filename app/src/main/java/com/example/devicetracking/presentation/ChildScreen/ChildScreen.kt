package com.example.devicetracking.presentation.ChildScreen

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.devicetracking.domain.model.Location
import com.example.devicetracking.presentation.Location.LocationService
import com.example.devicetracking.ui.theme.colorButton1


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChildScreen(childViewModel:ChildViewModel = hiltViewModel()){

    val context = LocalContext.current


    Scaffold(

        floatingActionButton = {

            ExtendedFloatingActionButton(
                containerColor = colorButton1,
                onClick = {

                    val intent = Intent(context, LocationService::class.java)
                    context.startForegroundService(intent)

                }) {
                Text(
                    text = "Start Trip",
                    color = Color.White
                )

            }
        }
    ) {

        Column(
            modifier = Modifier.padding(it)
        ){


            Spacer(modifier = Modifier.weight(1f))

            
            
            MapScreen(childLocation = childViewModel.)
//
//            Image(
//                modifier = Modifier
//                    .size(400.dp)
//                    .padding(8.dp),
//                bitmap = childViewModel.bitmap.asImageBitmap(),
//                contentDescription = "")
//
//            Text(
//                modifier = Modifier
//                    .padding(8.dp)
//                    .align(Alignment.CenterHorizontally),
//                text = "Scan to add child device",
//                fontSize = 20.sp,
//                fontWeight = FontWeight.SemiBold
//            )

            Spacer(modifier = Modifier.weight(1f))


        }


    }



}


@Composable
fun MapScreen(
    childLocation : Location
){


}