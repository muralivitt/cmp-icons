package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.MessageCircle: ImageVector
    get() {
        if (_MessageCircle != null) {
            return _MessageCircle!!
        }
        _MessageCircle = ImageVector.Builder(
            name = "MessageCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.25f, 10.18f)
                verticalLineTo(12.81f)
                curveTo(17.25f, 12.98f, 17.24f, 13.14f, 17.22f, 13.3f)
                curveTo(17.07f, 15.07f, 16.02f, 15.95f, 14.1f, 15.95f)
                horizontalLineTo(13.84f)
                curveTo(13.68f, 15.95f, 13.52f, 16.03f, 13.42f, 16.16f)
                lineTo(12.63f, 17.21f)
                curveTo(12.28f, 17.68f, 11.72f, 17.68f, 11.37f, 17.21f)
                lineTo(10.58f, 16.16f)
                curveTo(10.49f, 16.05f, 10.3f, 15.95f, 10.16f, 15.95f)
                horizontalLineTo(9.9f)
                curveTo(7.8f, 15.95f, 6.75f, 15.43f, 6.75f, 12.8f)
                verticalLineTo(10.17f)
                curveTo(6.75f, 8.25f, 7.64f, 7.2f, 9.4f, 7.05f)
                curveTo(9.56f, 7.03f, 9.72f, 7.02f, 9.89f, 7.02f)
                horizontalLineTo(14.09f)
                curveTo(16.2f, 7.04f, 17.25f, 8.09f, 17.25f, 10.18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _MessageCircle!!
    }

@Suppress("ObjectPropertyName")
private var _MessageCircle: ImageVector? = null
