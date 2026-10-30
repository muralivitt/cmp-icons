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

val VuesaxIconsTwotone.Category: ImageVector
    get() {
        if (_Category != null) {
            return _Category!!
        }
        _Category = ImageVector.Builder(
            name = "Category",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 10f)
                horizontalLineTo(7f)
                curveTo(9f, 10f, 10f, 9f, 10f, 7f)
                verticalLineTo(5f)
                curveTo(10f, 3f, 9f, 2f, 7f, 2f)
                horizontalLineTo(5f)
                curveTo(3f, 2f, 2f, 3f, 2f, 5f)
                verticalLineTo(7f)
                curveTo(2f, 9f, 3f, 10f, 5f, 10f)
                close()
            }
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
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 22f)
                horizontalLineTo(19f)
                curveTo(21f, 22f, 22f, 21f, 22f, 19f)
                verticalLineTo(17f)
                curveTo(22f, 15f, 21f, 14f, 19f, 14f)
                horizontalLineTo(17f)
                curveTo(15f, 14f, 14f, 15f, 14f, 17f)
                verticalLineTo(19f)
                curveTo(14f, 21f, 15f, 22f, 17f, 22f)
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
        }.build()

        return _Category!!
    }

@Suppress("ObjectPropertyName")
private var _Category: ImageVector? = null
