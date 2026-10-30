package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.ProfileAdd: ImageVector
    get() {
        if (_ProfileAdd != null) {
            return _ProfileAdd!!
        }
        _ProfileAdd = ImageVector.Builder(
            name = "ProfileAdd",
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
                moveTo(18.5f, 19.5f)
                horizontalLineTo(14.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 21.5f)
                verticalLineTo(17.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.16f, 10.87f)
                curveTo(12.06f, 10.86f, 11.94f, 10.86f, 11.83f, 10.87f)
                curveTo(9.45f, 10.79f, 7.56f, 8.84f, 7.56f, 6.44f)
                curveTo(7.55f, 3.99f, 9.54f, 2f, 11.99f, 2f)
                curveTo(14.44f, 2f, 16.43f, 3.99f, 16.43f, 6.44f)
                curveTo(16.43f, 8.84f, 14.53f, 10.79f, 12.16f, 10.87f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.99f, 21.81f)
                curveTo(10.17f, 21.81f, 8.36f, 21.35f, 6.98f, 20.43f)
                curveTo(4.56f, 18.81f, 4.56f, 16.17f, 6.98f, 14.56f)
                curveTo(9.73f, 12.72f, 14.24f, 12.72f, 16.99f, 14.56f)
            }
        }.build()

        return _ProfileAdd!!
    }

@Suppress("ObjectPropertyName")
private var _ProfileAdd: ImageVector? = null
