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

val VuesaxIconsTwotone.Musicnote: ImageVector
    get() {
        if (_Musicnote != null) {
            return _Musicnote!!
        }
        _Musicnote = ImageVector.Builder(
            name = "Musicnote",
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
                moveTo(7.971f, 22f)
                curveTo(10.18f, 22f, 11.971f, 20.209f, 11.971f, 18f)
                curveTo(11.971f, 15.791f, 10.18f, 14f, 7.971f, 14f)
                curveTo(5.762f, 14f, 3.971f, 15.791f, 3.971f, 18f)
                curveTo(3.971f, 20.209f, 5.762f, 22f, 7.971f, 22f)
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
                moveTo(11.971f, 18f)
                verticalLineTo(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.611f, 2.11f)
                lineTo(19.031f, 3.58f)
                curveTo(20.101f, 3.94f, 20.98f, 5.15f, 20.98f, 6.28f)
                verticalLineTo(7.45f)
                curveTo(20.98f, 8.98f, 19.801f, 9.83f, 18.351f, 9.35f)
                lineTo(13.931f, 7.88f)
                curveTo(12.861f, 7.52f, 11.981f, 6.31f, 11.981f, 5.18f)
                verticalLineTo(4f)
                curveTo(11.97f, 2.48f, 13.16f, 1.62f, 14.611f, 2.11f)
                close()
            }
        }.build()

        return _Musicnote!!
    }

@Suppress("ObjectPropertyName")
private var _Musicnote: ImageVector? = null
