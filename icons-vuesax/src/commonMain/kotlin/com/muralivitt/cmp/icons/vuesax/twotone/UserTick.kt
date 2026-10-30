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

val VuesaxIconsTwotone.UserTick: ImageVector
    get() {
        if (_UserTick != null) {
            return _UserTick!!
        }
        _UserTick = ImageVector.Builder(
            name = "UserTick",
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
                moveTo(12f, 12f)
                curveTo(14.761f, 12f, 17f, 9.761f, 17f, 7f)
                curveTo(17f, 4.239f, 14.761f, 2f, 12f, 2f)
                curveTo(9.239f, 2f, 7f, 4.239f, 7f, 7f)
                curveTo(7f, 9.761f, 9.239f, 12f, 12f, 12f)
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
                moveTo(3.41f, 22f)
                curveTo(3.41f, 18.13f, 7.26f, 15f, 12f, 15f)
                curveTo(12.96f, 15f, 13.89f, 15.13f, 14.76f, 15.37f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 18f)
                curveTo(22f, 18.75f, 21.79f, 19.46f, 21.42f, 20.06f)
                curveTo(21.21f, 20.42f, 20.94f, 20.74f, 20.63f, 21f)
                curveTo(19.93f, 21.63f, 19.01f, 22f, 18f, 22f)
                curveTo(16.54f, 22f, 15.27f, 21.22f, 14.58f, 20.06f)
                curveTo(14.21f, 19.46f, 14f, 18.75f, 14f, 18f)
                curveTo(14f, 16.74f, 14.58f, 15.61f, 15.5f, 14.88f)
                curveTo(16.19f, 14.33f, 17.06f, 14f, 18f, 14f)
                curveTo(20.21f, 14f, 22f, 15.79f, 22f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.44f, 18f)
                lineTo(17.429f, 18.99f)
                lineTo(19.559f, 17.02f)
            }
        }.build()

        return _UserTick!!
    }

@Suppress("ObjectPropertyName")
private var _UserTick: ImageVector? = null
