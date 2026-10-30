package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Cards: ImageVector
    get() {
        if (_Cards != null) {
            return _Cards!!
        }
        _Cards = ImageVector.Builder(
            name = "Cards",
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
                moveTo(2f, 12.61f)
                horizontalLineTo(19f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 10.28f)
                verticalLineTo(17.43f)
                curveTo(18.97f, 20.28f, 18.19f, 21f, 15.22f, 21f)
                horizontalLineTo(5.78f)
                curveTo(2.76f, 21f, 2f, 20.25f, 2f, 17.27f)
                verticalLineTo(10.28f)
                curveTo(2f, 7.58f, 2.63f, 6.71f, 5f, 6.57f)
                curveTo(5.24f, 6.56f, 5.5f, 6.55f, 5.78f, 6.55f)
                horizontalLineTo(15.22f)
                curveTo(18.24f, 6.55f, 19f, 7.3f, 19f, 10.28f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 6.73f)
                verticalLineTo(13.72f)
                curveTo(22f, 16.42f, 21.37f, 17.29f, 19f, 17.43f)
                verticalLineTo(10.28f)
                curveTo(19f, 7.3f, 18.24f, 6.55f, 15.22f, 6.55f)
                horizontalLineTo(5.78f)
                curveTo(5.5f, 6.55f, 5.24f, 6.56f, 5f, 6.57f)
                curveTo(5.03f, 3.72f, 5.81f, 3f, 8.78f, 3f)
                horizontalLineTo(18.22f)
                curveTo(21.24f, 3f, 22f, 3.75f, 22f, 6.73f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.25f, 17.81f)
                horizontalLineTo(6.97f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.11f, 17.81f)
                horizontalLineTo(12.55f)
            }
        }.build()

        return _Cards!!
    }

@Suppress("ObjectPropertyName")
private var _Cards: ImageVector? = null
