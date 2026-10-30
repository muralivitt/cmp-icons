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

val VuesaxIconsTwotone.Sun1: ImageVector
    get() {
        if (_Sun1 != null) {
            return _Sun1!!
        }
        _Sun1 = ImageVector.Builder(
            name = "Sun1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18.5f)
                curveTo(15.59f, 18.5f, 18.5f, 15.59f, 18.5f, 12f)
                curveTo(18.5f, 8.41f, 15.59f, 5.5f, 12f, 5.5f)
                curveTo(8.41f, 5.5f, 5.5f, 8.41f, 5.5f, 12f)
                curveTo(5.5f, 15.59f, 8.41f, 18.5f, 12f, 18.5f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.14f, 19.14f)
                lineTo(19.01f, 19.01f)
                moveTo(19.01f, 4.99f)
                lineTo(19.14f, 4.86f)
                lineTo(19.01f, 4.99f)
                close()
                moveTo(4.86f, 19.14f)
                lineTo(4.99f, 19.01f)
                lineTo(4.86f, 19.14f)
                close()
                moveTo(12f, 2.08f)
                verticalLineTo(2f)
                verticalLineTo(2.08f)
                close()
                moveTo(12f, 22f)
                verticalLineTo(21.92f)
                verticalLineTo(22f)
                close()
                moveTo(2.08f, 12f)
                horizontalLineTo(2f)
                horizontalLineTo(2.08f)
                close()
                moveTo(22f, 12f)
                horizontalLineTo(21.92f)
                horizontalLineTo(22f)
                close()
                moveTo(4.99f, 4.99f)
                lineTo(4.86f, 4.86f)
                lineTo(4.99f, 4.99f)
                close()
            }
        }.build()

        return _Sun1!!
    }

@Suppress("ObjectPropertyName")
private var _Sun1: ImageVector? = null
