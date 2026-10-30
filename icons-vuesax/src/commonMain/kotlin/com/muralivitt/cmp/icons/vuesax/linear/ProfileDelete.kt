package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.ProfileDelete: ImageVector
    get() {
        if (_ProfileDelete != null) {
            return _ProfileDelete!!
        }
        _ProfileDelete = ImageVector.Builder(
            name = "ProfileDelete",
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
                moveTo(18.41f, 18.09f)
                lineTo(15.59f, 20.91f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.41f, 20.91f)
                lineTo(15.59f, 18.09f)
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
                curveTo(7.56f, 3.99f, 9.54f, 2f, 12f, 2f)
                curveTo(14.45f, 2f, 16.44f, 3.99f, 16.44f, 6.44f)
                curveTo(16.43f, 8.84f, 14.54f, 10.79f, 12.16f, 10.87f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21.81f)
                curveTo(10.18f, 21.81f, 8.37f, 21.35f, 6.99f, 20.43f)
                curveTo(4.57f, 18.81f, 4.57f, 16.17f, 6.99f, 14.56f)
                curveTo(9.74f, 12.72f, 14.25f, 12.72f, 17f, 14.56f)
            }
        }.build()

        return _ProfileDelete!!
    }

@Suppress("ObjectPropertyName")
private var _ProfileDelete: ImageVector? = null
