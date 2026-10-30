package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Category2: ImageVector
    get() {
        if (_Category2 != null) {
            return _Category2!!
        }
        _Category2 = ImageVector.Builder(
            name = "Category2",
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
                moveTo(17f, 10f)
                horizontalLineTo(19f)
                curveTo(21f, 10f, 22f, 9f, 22f, 7f)
                verticalLineTo(5f)
                curveTo(22f, 3f, 21f, 2f, 19f, 2f)
                horizontalLineTo(17f)
                curveTo(15f, 2f, 14f, 3f, 14f, 5f)
                verticalLineTo(7f)
                curveTo(14f, 9f, 15f, 10f, 17f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 22f)
                horizontalLineTo(7f)
                curveTo(9f, 22f, 10f, 21f, 10f, 19f)
                verticalLineTo(17f)
                curveTo(10f, 15f, 9f, 14f, 7f, 14f)
                horizontalLineTo(5f)
                curveTo(3f, 14f, 2f, 15f, 2f, 17f)
                verticalLineTo(19f)
                curveTo(2f, 21f, 3f, 22f, 5f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 10f)
                curveTo(8.209f, 10f, 10f, 8.209f, 10f, 6f)
                curveTo(10f, 3.791f, 8.209f, 2f, 6f, 2f)
                curveTo(3.791f, 2f, 2f, 3.791f, 2f, 6f)
                curveTo(2f, 8.209f, 3.791f, 10f, 6f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 22f)
                curveTo(20.209f, 22f, 22f, 20.209f, 22f, 18f)
                curveTo(22f, 15.791f, 20.209f, 14f, 18f, 14f)
                curveTo(15.791f, 14f, 14f, 15.791f, 14f, 18f)
                curveTo(14f, 20.209f, 15.791f, 22f, 18f, 22f)
                close()
            }
        }.build()

        return _Category2!!
    }

@Suppress("ObjectPropertyName")
private var _Category2: ImageVector? = null
