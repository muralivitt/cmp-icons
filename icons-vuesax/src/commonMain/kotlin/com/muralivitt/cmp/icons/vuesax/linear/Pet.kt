package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Pet: ImageVector
    get() {
        if (_Pet != null) {
            return _Pet!!
        }
        _Pet = ImageVector.Builder(
            name = "Pet",
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
                moveTo(4.41f, 16.75f)
                curveTo(4.17f, 19.64f, 6.35f, 22f, 9.25f, 22f)
                horizontalLineTo(14.04f)
                curveTo(17.3f, 22f, 19.54f, 19.37f, 19f, 16.15f)
                curveTo(18.43f, 12.77f, 15.17f, 10f, 11.74f, 10f)
                curveTo(8.02f, 10f, 4.72f, 13.04f, 4.41f, 16.75f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.47f, 7.5f)
                curveTo(11.851f, 7.5f, 12.97f, 6.381f, 12.97f, 5f)
                curveTo(12.97f, 3.619f, 11.851f, 2.5f, 10.47f, 2.5f)
                curveTo(9.089f, 2.5f, 7.97f, 3.619f, 7.97f, 5f)
                curveTo(7.97f, 6.381f, 9.089f, 7.5f, 10.47f, 7.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.3f, 8.7f)
                curveTo(18.405f, 8.7f, 19.3f, 7.805f, 19.3f, 6.7f)
                curveTo(19.3f, 5.595f, 18.405f, 4.7f, 17.3f, 4.7f)
                curveTo(16.195f, 4.7f, 15.3f, 5.595f, 15.3f, 6.7f)
                curveTo(15.3f, 7.805f, 16.195f, 8.7f, 17.3f, 8.7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 12.7f)
                curveTo(21.828f, 12.7f, 22.5f, 12.028f, 22.5f, 11.2f)
                curveTo(22.5f, 10.372f, 21.828f, 9.7f, 21f, 9.7f)
                curveTo(20.172f, 9.7f, 19.5f, 10.372f, 19.5f, 11.2f)
                curveTo(19.5f, 12.028f, 20.172f, 12.7f, 21f, 12.7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.97f, 10.7f)
                curveTo(5.075f, 10.7f, 5.97f, 9.805f, 5.97f, 8.7f)
                curveTo(5.97f, 7.595f, 5.075f, 6.7f, 3.97f, 6.7f)
                curveTo(2.865f, 6.7f, 1.97f, 7.595f, 1.97f, 8.7f)
                curveTo(1.97f, 9.805f, 2.865f, 10.7f, 3.97f, 10.7f)
                close()
            }
        }.build()

        return _Pet!!
    }

@Suppress("ObjectPropertyName")
private var _Pet: ImageVector? = null
