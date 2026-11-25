
package com.example.laboratorio14

import android.content.Context
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.background
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.Column
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.fillMaxWidth
import androidx.glance.layout.padding
import androidx.glance.text.Text

class SimpleWidgetContent : GlanceAppWidget() {

    override suspend fun provideGlance(
        context: Context,
        id: GlanceId
    ) {
        provideContent {

            Column(
                modifier = GlanceModifier
                    .fillMaxSize()
                    .background(R.color.widget_background)
                    .padding(R.dimen.widget_padding)
            ) {

                Column(
                    modifier = GlanceModifier
                        .fillMaxWidth()
                        .background(R.color.widget_header)
                        .padding(R.dimen.widget_padding)
                ) {
                    Text(text = "EL DESECHO")
                    Text(text = "ESTADISTICAS DEL JUGADOR")
                }

                Column(
                    modifier = GlanceModifier
                        .fillMaxWidth()
                        .background(R.color.widget_card)
                        .padding(R.dimen.widget_padding)
                ) {
                    Text(text = "CAPITULO ACTUAL")
                    Text(text = "03 / 05")
                }

                Column(
                    modifier = GlanceModifier
                        .fillMaxWidth()
                        .background(R.color.widget_deaths)
                        .padding(R.dimen.widget_padding)
                ) {
                    Text(text = "MUERTES")
                    Text(text = "08")
                }

                Column(
                    modifier = GlanceModifier
                        .fillMaxWidth()
                        .background(R.color.widget_card)
                        .padding(R.dimen.widget_padding)
                ) {
                    Text(text = "OBJETOS ENCONTRADOS")
                    Text(text = "2 / 4")
                }

                Column(
                    modifier = GlanceModifier
                        .fillMaxWidth()
                        .background(R.color.widget_card)
                        .padding(R.dimen.widget_padding)
                ) {
                    Text(text = "PROGRESO DEL JUEGO")
                    Text(text = "60 % COMPLETADO")
                }
            }
        }
    }
}
