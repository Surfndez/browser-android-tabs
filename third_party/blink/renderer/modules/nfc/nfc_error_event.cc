// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

#include "third_party/blink/renderer/modules/nfc/nfc_error_event.h"

#include "third_party/blink/renderer/bindings/core/v8/v8_binding_for_core.h"
#include "v8/include/v8.h"

namespace blink {

NFCErrorEvent::NFCErrorEvent(const AtomicString& event_type,
                             DOMException* error)
    : Event(event_type, Bubbles::kNo, Cancelable::kNo), error_(error) {
  DCHECK(error_);
}

NFCErrorEvent::NFCErrorEvent(const AtomicString& event_type,
                             const NFCErrorEventInit* initializer)
    : Event(event_type, initializer), error_(initializer->error()) {
  DCHECK(error_);
}

NFCErrorEvent::~NFCErrorEvent() = default;

const AtomicString& NFCErrorEvent::InterfaceName() const {
  return event_interface_names::kNFCErrorEvent;
}

void NFCErrorEvent::Trace(blink::Visitor* visitor) {
  visitor->Trace(error_);
  Event::Trace(visitor);
}

}  // namespace blink
