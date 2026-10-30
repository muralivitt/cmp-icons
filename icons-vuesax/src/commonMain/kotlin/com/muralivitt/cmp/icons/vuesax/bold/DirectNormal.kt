package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.DirectNormal: ImageVector
    get() {
        if (_DirectNormal != null) {
            return _DirectNormal!!
        }
        _DirectNormal = ImageVector.Builder(
            name = "DirectNormal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21.3f, 12.231f)
                horizontalLineTo(17.82f)
                curveTo(16.84f, 12.231f, 15.97f, 12.771f, 15.53f, 13.651f)
                lineTo(14.69f, 15.311f)
                curveTo(14.49f, 15.71f, 14.09f, 15.96f, 13.65f, 15.96f)
                horizontalLineTo(10.37f)
                curveTo(10.06f, 15.96f, 9.62f, 15.891f, 9.33f, 15.311f)
                lineTo(8.49f, 13.66f)
                curveTo(8.05f, 12.79f, 7.17f, 12.241f, 6.2f, 12.241f)
                horizontalLineTo(2.7f)
                curveTo(2.31f, 12.241f, 2f, 12.55f, 2f, 12.941f)
                verticalLineTo(16.201f)
                curveTo(2f, 19.83f, 4.18f, 22f, 7.82f, 22f)
                horizontalLineTo(16.2f)
                curveTo(19.63f, 22f, 21.74f, 20.121f, 22f, 16.781f)
                verticalLineTo(12.931f)
                curveTo(22f, 12.55f, 21.69f, 12.231f, 21.3f, 12.231f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22f, 7.81f)
                verticalLineTo(10.85f)
                curveTo(21.78f, 10.77f, 21.54f, 10.73f, 21.3f, 10.73f)
                horizontalLineTo(17.82f)
                curveTo(16.27f, 10.73f, 14.88f, 11.59f, 14.19f, 12.97f)
                lineTo(13.44f, 14.45f)
                horizontalLineTo(10.58f)
                lineTo(9.83f, 12.98f)
                curveTo(9.14f, 11.59f, 7.75f, 10.73f, 6.2f, 10.73f)
                horizontalLineTo(2.7f)
                curveTo(2.46f, 10.73f, 2.22f, 10.77f, 2f, 10.85f)
                verticalLineTo(7.81f)
                curveTo(2f, 4.17f, 4.17f, 2f, 7.81f, 2f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 2f, 22f, 4.17f, 22f, 7.81f)
                close()
            }
        }.build()

        return _DirectNormal!!
    }

@Suppress("ObjectPropertyName")
private var _DirectNormal: ImageVector? = null
