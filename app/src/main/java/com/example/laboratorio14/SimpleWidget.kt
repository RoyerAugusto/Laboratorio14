package com.example.laboratorio14

import androidx.glance.appwidget.GlanceAppWidgetReceiver

class SimpleWidget : GlanceAppWidgetReceiver() {
    override val glanceAppWidget = SimpleWidgetContent()
}