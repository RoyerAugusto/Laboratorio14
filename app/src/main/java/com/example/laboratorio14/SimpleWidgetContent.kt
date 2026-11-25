package com.example.laboratorio14

import android.content.Context
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.Button
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.padding
import androidx.glance.text.Text
import android.content.Intent
import androidx.glance.action.actionStartActivity
import android.content.ComponentName

class SimpleWidgetContent : GlanceAppWidget() {

    override suspend fun provideGlance(
        context: Context,
        id: GlanceId
    ) {
        provideContent {
            Column(
                modifier = GlanceModifier
                    .fillMaxSize()
                    .padding(R.dimen.widget_padding),
                verticalAlignment = Alignment.Vertical.CenterVertically,
                horizontalAlignment = Alignment.Horizontal.CenterHorizontally
            ) {
                Text(text = "¡Hola desde mi Widget!")

                Text(text = "Mi primer widget con Jetpack Glance")

                Button(
                    text = "Abrir segunda vista",
                    onClick = actionStartActivity(
                        ComponentName(context, SecondActivity::class.java)
                    )
                )
            }
        }
    }
}