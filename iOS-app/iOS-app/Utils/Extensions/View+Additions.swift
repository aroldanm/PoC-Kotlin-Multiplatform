//
//  View+Additions.swift
//  iOS-app
//
//  Created by Alan Roldán on 18/11/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import SwiftUI

// MARK: - AnyView
public extension View {
    var asAnyView: AnyView {
        AnyView(self)
    }
}
