//
//  BaseProtocols.swift
//  iOS-app
//
//  Created by Alan Roldán on 18/11/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import SwiftUI

protocol SceneResolver {
    var view: AnyView { get }
}

protocol ViewModelProtocol: ObservableObject {
}

