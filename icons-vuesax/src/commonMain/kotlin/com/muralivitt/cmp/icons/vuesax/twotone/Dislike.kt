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

val VuesaxIconsTwotone.Dislike: ImageVector
    get() {
        if (_Dislike != null) {
            return _Dislike!!
        }
        _Dislike = ImageVector.Builder(
            name = "Dislike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f
            ) {
                moveTo(16.52f, 5.65f)
                lineTo(13.42f, 3.25f)
                curveTo(13.02f, 2.85f, 12.12f, 2.65f, 11.52f, 2.65f)
                horizontalLineTo(7.72f)
                curveTo(6.52f, 2.65f, 5.22f, 3.55f, 4.92f, 4.75f)
                lineTo(2.52f, 12.05f)
                curveTo(2.02f, 13.45f, 2.92f, 14.65f, 4.42f, 14.65f)
                horizontalLineTo(8.42f)
                curveTo(9.02f, 14.65f, 9.52f, 15.15f, 9.42f, 15.85f)
                lineTo(8.92f, 19.05f)
                curveTo(8.72f, 19.95f, 9.32f, 20.95f, 10.22f, 21.25f)
                curveTo(11.02f, 21.55f, 12.02f, 21.15f, 12.42f, 20.55f)
                lineTo(16.52f, 14.45f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.619f, 5.65f)
                verticalLineTo(15.45f)
                curveTo(21.619f, 16.85f, 21.019f, 17.35f, 19.619f, 17.35f)
                horizontalLineTo(18.619f)
                curveTo(17.219f, 17.35f, 16.619f, 16.85f, 16.619f, 15.45f)
                verticalLineTo(5.65f)
                curveTo(16.619f, 4.25f, 17.219f, 3.75f, 18.619f, 3.75f)
                horizontalLineTo(19.619f)
                curveTo(21.019f, 3.75f, 21.619f, 4.25f, 21.619f, 5.65f)
                close()
            }
        }.build()

        return _Dislike!!
    }

@Suppress("ObjectPropertyName")
private var _Dislike: ImageVector? = null
