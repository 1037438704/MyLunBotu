package mykuangjiaceshi.tixunda.com.mylunbotu;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.holder.Holder;
import com.bumptech.glide.Glide;

/**
 *
 * @author dell-pc
 * @date 2018/6/27
 */

public class LocalImageHolderView implements Holder<String> {
    private ImageView imageView;
    @Override
    public View createView(Context context) {
        imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }
    /**
     * 这里要注意传的是字符串还是int 型的
     * */
    @Override
    public void UpdateUI(Context context, int position, String data) {
//        imageView.setImageResource(data);
        Glide.with(context).load(data).into(imageView);
    }
}
