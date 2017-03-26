package com.michaelfotiadis.steam.dota2.loader.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.michaelfotiadis.steam.dota2.loader.sample.utils.CrossfadeWrapper;
import com.mikepenz.crossfader.Crossfader;
import com.mikepenz.crossfader.util.UIUtils;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.MiniDrawer;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    Toolbar mToolbar;

    private Drawer mDrawer = null;
    private MiniDrawer mMiniDrawer = null;
    private Crossfader mCrossFader;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);

        setTitle("Steam Loader Sample");

        ButterKnife.bind(this);

        buildMiniDrawer(savedInstanceState);

    }

    private void buildMiniDrawer(final Bundle savedInstanceState) {
        final PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName("Steam")
                .withIcon(R.drawable.ic_steam).withIconTintingEnabled(true);
        final PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(1).withName("Dota 2")
                .withIcon(R.drawable.ic_dota_2).withIconTintingEnabled(true);

        mDrawer = new DrawerBuilder()
                .withActivity(this)
                .withTranslucentStatusBar(false)
                .withToolbar(mToolbar)
                .withCloseOnClick(true)
                .withGenerateMiniDrawer(true)
                .withSavedInstance(savedInstanceState)
                .withActionBarDrawerToggle(true)
                .addDrawerItems(item1, item2)
                .buildView();

        //the MiniDrawer is managed by the Drawer and we just get it to hook it into the Crossfader
        mMiniDrawer = mDrawer.getMiniDrawer();

        //get the widths in px for the first and second panel
        int firstWidth = (int) UIUtils.convertDpToPixel(300, this);
        int secondWidth = (int) UIUtils.convertDpToPixel(72, this);

        //create and build our crossfader (see the MiniDrawer is also builded in here, as the build method returns the view to be used in the crossfader)
        //the crossfader library can be found here: https://github.com/mikepenz/Crossfader
        mCrossFader = new Crossfader()
                .withContent(findViewById(R.id.content_frame))
                .withFirst(mDrawer.getSlider(), firstWidth)
                .withSecond(mMiniDrawer.build(this), secondWidth)
                .withSavedInstance(savedInstanceState)
                .build();

        //define the crossfader to be used with the miniDrawer. This is required to be able to automatically toggle open / close
        mMiniDrawer.withCrossFader(new CrossfadeWrapper(mCrossFader));

        //define a shadow (this is only for normal LTR layouts if you have a RTL app you need to define the other one
        mCrossFader.getCrossFadeSlidingPaneLayout().setShadowResourceLeft(R.drawable.material_drawer_shadow_left);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        //add the values which need to be saved from the drawer to the bundle
        if (mDrawer != null) {
            outState = mDrawer.saveInstanceState(outState);
        }
        //add the values which need to be saved from the crossFader to the bundle
        if (mCrossFader != null) {
            outState = mCrossFader.saveInstanceState(outState);
        }
        super.onSaveInstanceState(outState);
    }

}
