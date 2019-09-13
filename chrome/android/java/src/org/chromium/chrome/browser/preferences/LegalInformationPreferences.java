// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.preferences;

import android.os.Bundle;
import org.chromium.chrome.browser.preferences.BravePreferenceFragment;

import org.chromium.chrome.R;

/**
 * Fragment to display legal information about Chrome.
 */
public class LegalInformationPreferences extends BravePreferenceFragment {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String s) {
        PreferenceUtils.addPreferencesFromResource(this, R.xml.legal_information_preferences);
        getActivity().setTitle(R.string.legal_information_title);
    }
}
