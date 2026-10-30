package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Story: ImageVector
    get() {
        if (_Story != null) {
            return _Story!!
        }
        _Story = ImageVector.Builder(
            name = "Story",
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
                moveTo(16.42f, 7.95f)
                curveTo(18.86f, 10.39f, 18.86f, 14.35f, 16.42f, 16.79f)
                curveTo(13.98f, 19.23f, 10.02f, 19.23f, 7.58f, 16.79f)
                curveTo(5.14f, 14.35f, 5.14f, 10.39f, 7.58f, 7.95f)
                curveTo(10.02f, 5.51f, 13.98f, 5.51f, 16.42f, 7.95f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.25f, 21.64f)
                curveTo(6.25f, 20.84f, 4.5f, 19.39f, 3.34f, 17.38f)
                curveTo(2.2f, 15.41f, 1.82f, 13.22f, 2.09f, 11.13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.85f, 4.48f)
                curveTo(7.55f, 3.15f, 9.68f, 2.36f, 12f, 2.36f)
                curveTo(14.27f, 2.36f, 16.36f, 3.13f, 18.04f, 4.41f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.75f, 21.64f)
                curveTo(17.75f, 20.84f, 19.5f, 19.39f, 20.66f, 17.38f)
                curveTo(21.8f, 15.41f, 22.18f, 13.22f, 21.91f, 11.13f)
            }
        }.build()

        return _Story!!
    }

@Suppress("ObjectPropertyName")
private var _Story: ImageVector? = null
