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

val VuesaxIconsTwotone.UserMinus: ImageVector
    get() {
        if (_UserMinus != null) {
            return _UserMinus!!
        }
        _UserMinus = ImageVector.Builder(
            name = "UserMinus",
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
                curveTo(22f, 18.32f, 21.96f, 18.63f, 21.88f, 18.93f)
                curveTo(21.79f, 19.33f, 21.63f, 19.72f, 21.42f, 20.06f)
                curveTo(20.73f, 21.22f, 19.46f, 22f, 18f, 22f)
                curveTo(16.97f, 22f, 16.04f, 21.61f, 15.34f, 20.97f)
                curveTo(15.04f, 20.71f, 14.78f, 20.4f, 14.58f, 20.06f)
                curveTo(14.21f, 19.46f, 14f, 18.75f, 14f, 18f)
                curveTo(14f, 16.92f, 14.43f, 15.93f, 15.13f, 15.21f)
                curveTo(15.86f, 14.46f, 16.88f, 14f, 18f, 14f)
                curveTo(19.18f, 14f, 20.25f, 14.51f, 20.97f, 15.33f)
                curveTo(21.61f, 16.04f, 22f, 16.98f, 22f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.49f, 17.98f)
                horizontalLineTo(16.51f)
            }
        }.build()

        return _UserMinus!!
    }

@Suppress("ObjectPropertyName")
private var _UserMinus: ImageVector? = null
