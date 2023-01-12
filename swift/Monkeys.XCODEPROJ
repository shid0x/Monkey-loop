import AVFoundation

// AV player
let player = AVPlayer()
let playerItem = AVPlayerItem(url: <https://www.youtube.com/watch?v=wYewE8kWuxw>)
player.replaceCurrentItem(with: playerItem)

// loop
player.actionAtItemEnd = .none
player.addPeriodicTimeObserver(forInterval: CMTimeMake(value: 1, timescale: 1), queue: DispatchQueue.main) { [weak self] _ in
    guard let strongSelf = self else { return }
    if player.currentItem?.currentTime() == player.currentItem?.duration {
        player.seek(to: CMTime.zero)
    }
}

// video
player.play()

var password = "OUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUH"
print("OUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUH")
let enteredPassword = readLine()

// libéré des singes ou pas ?
if enteredPassword == password {
    player.pause()
    print("OUHOUHOUHOUHOUHOUH Bravo")
} else {
    print("OUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUHOUH AGAIN ")
}