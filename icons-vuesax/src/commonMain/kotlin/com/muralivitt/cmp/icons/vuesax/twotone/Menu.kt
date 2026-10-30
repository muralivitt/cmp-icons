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

val VuesaxIconsTwotone.Menu: ImageVector
    get() {
        if (_Menu != null) {
            return _Menu!!
        }
        _Menu = ImageVector.Builder(
            name = "Menu",
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
                moveTo(17.54f, 8.31f)
                curveTo(18.899f, 8.31f, 20f, 7.209f, 20f, 5.85f)
                curveTo(20f, 4.492f, 18.899f, 3.39f, 17.54f, 3.39f)
                curveTo(16.181f, 3.39f, 15.08f, 4.492f, 15.08f, 5.85f)
                curveTo(15.08f, 7.209f, 16.181f, 8.31f, 17.54f, 8.31f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.46f, 8.31f)
                curveTo(7.819f, 8.31f, 8.92f, 7.209f, 8.92f, 5.85f)
                curveTo(8.92f, 4.492f, 7.819f, 3.39f, 6.46f, 3.39f)
                curveTo(5.101f, 3.39f, 4f, 4.492f, 4f, 5.85f)
                curveTo(4f, 7.209f, 5.101f, 8.31f, 6.46f, 8.31f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.54f, 20.61f)
                curveTo(18.899f, 20.61f, 20f, 19.509f, 20f, 18.15f)
                curveTo(20f, 16.791f, 18.899f, 15.69f, 17.54f, 15.69f)
                curveTo(16.181f, 15.69f, 15.08f, 16.791f, 15.08f, 18.15f)
                curveTo(15.08f, 19.509f, 16.181f, 20.61f, 17.54f, 20.61f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.46f, 20.61f)
                curveTo(7.819f, 20.61f, 8.92f, 19.509f, 8.92f, 18.15f)
                curveTo(8.92f, 16.791f, 7.819f, 15.69f, 6.46f, 15.69f)
                curveTo(5.101f, 15.69f, 4f, 16.791f, 4f, 18.15f)
                curveTo(4f, 19.509f, 5.101f, 20.61f, 6.46f, 20.61f)
                close()
            }
        }.build()

        return _Menu!!
    }

@Suppress("ObjectPropertyName")
private var _Menu: ImageVector? = null
