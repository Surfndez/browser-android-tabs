// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

#ifndef IOS_CHROME_BROWSER_UI_PAYMENTS_PAYMENT_REQUEST_VIEW_CONTROLLER_ACTIONS_H_
#define IOS_CHROME_BROWSER_UI_PAYMENTS_PAYMENT_REQUEST_VIEW_CONTROLLER_ACTIONS_H_

// Protocol handling the actions sent in the PaymentRequestViewController.
@protocol PaymentRequestViewControllerActions

// Called when the user presses the cancel button.
- (void)onCancel;

// Called when the user presses the confirm button.
- (void)onConfirm;

@end

#endif  // IOS_CHROME_BROWSER_UI_PAYMENTS_PAYMENT_REQUEST_VIEW_CONTROLLER_ACTIONS_H_
